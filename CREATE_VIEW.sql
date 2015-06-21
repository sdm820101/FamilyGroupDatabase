/* work_record 
   -> person_id(int)
   -> company_name(varchar 50)
   -> position(varchar 50) 
   -> year_started(int)
   -> year_ended(int) */

CREATE VIEW work_record AS
SELECT
	p.person_id,
	c.name company_name,
	j.position,
	EXTRACT(YEAR FROM d.order_date) AS year_started,
	EXTRACT(YEAR FROM t,order_date) AS year_ended
FROM
	PersonalInformation p,
	Work w,
	Offer o,
	Job j,
	Company c,
	Date d,
	Date t
WHERE 
		w.person_id = p.person_id
	AND o.job_id = w.job_id
	AND c.c_id = o.c_id
	AND j.job_id = o.job_id
	AND d.date_id = o.start_date_id
	AND t.date_id = isnull(o.end_date_id , 0) 

/* property
   -> person_id(int)
   -> property_id(int)
   -> property_description(varchar 50)
   -> property_type(car,motorcycle,house/apartment)
   -> time_of_purchase(date)  */

CREATE VIEW property AS
SELECT
	p.person_id,
	o.property_id,
	y.description property_description,
	y.type property_type,
	d.order_date time_of_pirchase
FROM
	PersonalInformation p,
	own o,
	property y,
	purchasedTime t,
	Date d
WHERE
	    o.person_id = p.person_id
	AND y.property_id = 0.property_id
	AND t.property_id = o.property_id
	AND t.person_id = p.person_id
	AND d.date_id = t.date_id

	
