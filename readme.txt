Datasource with jndi lookup
	1 - resources.xml in web-inf or tomee.xml
	2 - add resource-ref , res-ref-name, res-type, mapped-name, res-auth in web-inf/web.xml file
	3- initial context lookup


DataSource with @Resource(name="")
	1-resource.xml
	2-don't need web.xml
	3-Add annotation

DataSource with JPA

	1 - persistence xml in webap/META-INF/persistence.xml
	2 - Create EJB + @PeresistenceContext(unitName="")
	3 - Create Entity


