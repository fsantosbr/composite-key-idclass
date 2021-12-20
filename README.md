# composite-key-idclass

Composite Primary Key - @IdClass - Mapper

When a database table contains a primary key made of 2 or more columns. We Use a class to represent the primary key.
In this example, we are using @IdClass annotation in the Entity class. The Entity class has all attributes from the table, each attribute that are a compound primary key, we annotade with @Id. Still, we created a separed class with only the columns that are primary key. This class named EntityPK is used in the JpaRepository implementation.

With this approach (@IdClass), we can use query methods (we're using here).
We can also use Oracle sequence for all attribute/column. Using embedded annotation won't let us work with oracle Sequence for fields in the composite primary key.

We're using mapper from org.mapstruct.
This helps us mappinng entity to DTO and so on.
In the pom:
    <dependency>
			<groupId>org.mapstruct</groupId>
			<artifactId>mapstruct</artifactId>
			<version>1.4.1.Final</version>
		</dependency>

The following plugin is useful to generate the mapper implementation during the build
    <plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.5.1</version>
				<configuration>
					<source>11</source>
					<target>11</target>
					<annotationProcessorPaths>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>1.4.1.Final</version>
						</path>
					</annotationProcessorPaths>
				</configuration>
			</plugin>

Oracle database script:
create table TB_ERROR_GAME (
GAME_ID NUMBER(4),
GAME_PLATFORM NVARCHAR2(7),
ERROR_SEQUENCE_NUMBER NUMBER(11),

ERROR_CODE NUMBER(3),
ERROR_MESSAGE NVARCHAR2(255),

constraint ERROR_GAME_PK primary key (GAME_ID, GAME_PLATFORM, ERROR_SEQUENCE_NUMBER));
      
  
