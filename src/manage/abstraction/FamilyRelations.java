package manage.abstraction;

public class FamilyRelations {
	private PersonalInformation memberID;
	private RelationshipType relationshipType;
	
	public FamilyRelations(PersonalInformation mID, RelationshipType r) {
		this.memberID = mID;
		this.relationshipType = r;
	}
	
	public PersonalInformation getMemberID() {
		return this.memberID;
	}
	
	public void setMemberID(PersonalInformation memberID) {
		this.memberID = memberID;
	}
	
	public RelationshipType getRelationshipType() {
		return this.relationshipType;
	}
	
	public void setRelationshipType(RelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}
}
