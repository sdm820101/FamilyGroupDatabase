package manage.abstraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBFamilyGroup {
	/**
	 * 
	 */
	private static Connection connexion;
	/**
	 * 
	 */
	private static final String jdbcDriver = "org.hsqldb.jdbcDriver";

	/**
	 * 
	 */
	private static final String database = "jdbc:hsqldb:file:db/familygroupdb";

	/**
	 * 
	 */
	private static final String user = "familygroup";

	/**
	 * 
	 */
	private static final String password = "familygroup";

	
	public static Connection getConnexion() {
		return connexion;
	}

	public static void connexionBD() {
		try {
			// On commence par charger le driver JDBC d'HyperSQL
			Class.forName(jdbcDriver).newInstance();
		} catch (InstantiationException e) {
			System.out.println("ERROR: failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// Puis on se connecte � la base de donnees
			connexion = DriverManager.getConnection(database, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Arr礙te correctement HyperSQL
	 * 
	 * @throws SQLException
	 */
	public static void arretBD() throws SQLException {
		Statement st = connexion.createStatement();
		// On envoie l'instruction pour arreter proprement HSQLDB
		st.execute("SHUTDOWN");
		// On ferme la connexion
		connexion.close();
	}
	
	/**
	 * Testing
	 */
	public static void main(String[] args) {
		DBFamilyGroup.connexionBD();
		try {
			System.out.println("creation de la table...");
			Statement s = DBFamilyGroup.getConnexion().createStatement();
			s.executeUpdate("DROP TABLE ... IF EXISTS; DROP TABLE ... IF EXISTS; DROP TABLE DISCIPLINEATHLETE IF EXISTS; "
					+ "DROP TABLE ATHLETE IF EXISTS; DROP TABLE DISCIPLINE IF EXISTS;");
			s.executeUpdate("CREATE TABLE Athlete (email VARCHAR(30) PRIMARY KEY, nom VARCHAR(30), prenom VARCHAR(30));");
			s.executeUpdate("CREATE TABLE Discipline (nom VARCHAR(30) PRIMARY KEY, responsable VARCHAR(30));");
			s.executeUpdate("CREATE TABLE DisciplineAthlete (discipline VARCHAR(30), athlete VARCHAR(30), "
					+ "PRIMARY KEY (discipline, athlete));");
			s.executeUpdate("CREATE TABLE Competition (discipline VARCHAR(30), nom VARCHAR(30), date DATE, officielle BOOLEAN, "
					+ "PRIMARY KEY(discipline, nom));");
			s.executeUpdate("CREATE TABLE Resultat (discipline VARCHAR(30), competition VARCHAR(30), athlete VARCHAR(30), "
					+ "valeur FLOAT, juge VARCHAR(30), date DATE, definitive BOOLEAN, PRIMARY KEY(discipline, competition, athlete));");
			s.executeUpdate("ALTER TABLE DisciplineAthlete ADD FOREIGN KEY (discipline) REFERENCES Discipline(nom) ON DELETE RESTRICT ON UPDATE CASCADE;");
			s.executeUpdate("ALTER TABLE DisciplineAthlete ADD FOREIGN KEY (athlete) REFERENCES Athlete(email) ON DELETE RESTRICT ON UPDATE CASCADE;");
			s.executeUpdate("ALTER TABLE Competition ADD FOREIGN KEY (discipline) REFERENCES Discipline (nom) ON DELETE RESTRICT ON UPDATE CASCADE;");
			s.executeUpdate("ALTER TABLE Resultat ADD FOREIGN KEY (discipline, competition) REFERENCES Competition (discipline, nom) ON DELETE RESTRICT ON UPDATE CASCADE;");
			s.executeUpdate("ALTER TABLE Resultat ADD FOREIGN KEY (athlete) REFERENCES Athlete (email) ON DELETE RESTRICT ON UPDATE CASCADE;");
			s.executeUpdate("INSERT INTO Athlete VALUES ('torquato.tasso@mines-nantes.fr', 'Tasso', 'Torquato'), ('giuseppe.verdi@mines-nantes.fr', 'Verdi', 'Giuseppe');");
			s.executeUpdate("INSERT INTO Discipline VALUES ('100 metres', 'Tisi'), ('Marathon', 'Debruyne'), ('Saut en hauteur', 'Tisi');");
			s.executeUpdate("INSERT INTO DisciplineAthlete VALUES ('100 metres', 'torquato.tasso@mines-nantes.fr'),('100 metres', 'giuseppe.verdi@mines-nantes.fr');");
			s.executeUpdate("INSERT INTO Competition VALUES ('100 metres', 'Competition Officielle 1', '2012-09-23', true);");
			s.executeUpdate("INSERT INTO Resultat VALUES ('100 metres', 'Competition Officielle 1', 'torquato.tasso@mines-nantes.fr', 11.10, 'Petit', '2012-09-23', false), ('100 metres', 'Competition Officielle 1', 'giuseppe.verdi@mines-nantes.fr', 11.21, 'Mercadal', '2012-09-24', false);");

			DBFamilyGroup.arretBD();
			System.out.println("Initialisation: ok !");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
