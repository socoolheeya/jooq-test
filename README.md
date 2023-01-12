# Hello, this is Jooq-test
#### My first jooq-test project

-----
### Spec
#### Springboot 3.0.1, JPA, Jooq, Maria DB
### Here is Jooq
https://www.jooq.org/

--------
## gradle setting (Springboot 3.x.x, JDK17)
add buildscript
~~~
buildscript {
    configurations {
        classpath {
            resolutionStrategy.eachDependency {
                if (requested.group == 'org.jooq') {
                    useVersion '3.17.6'
                }
            }
        }
    }
}
~~~
add plugins
~~~
plugins {
    id 'nu.studer.jooq' version '8.1'
}
~~~
dependency
~~~
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-aop'
    implementation 'org.springframework.boot:spring-boot-starter-jooq'
    implementation 'org.jooq:jooq-codegen:3.17.6'
    implementation 'org.jooq:jooq-meta:3.17.6'
    implementation 'org.jetbrains:annotations:23.1.0'
    implementation 'com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.8.1'
    implementation 'org.hibernate.orm:hibernate-spatial:6.2.0.CR1'

    jooqGenerator 'org.mariadb.jdbc:mariadb-java-client'
    jooqGenerator 'jakarta.xml.bind:jakarta.xml.bind-api:4.0.0'

    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'


    annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.mockito:mockito-core:4.11.0'
    testImplementation 'org.mockito:mockito-junit-jupiter:4.11.0'
}
~~~
jooq configurations
~~~
import nu.studer.gradle.jooq.JooqEdition
import org.jooq.meta.jaxb.Logging

jooq {
    version = '3.17.6'
    edition = JooqEdition.OSS

    configurations {
        main {
            generateSchemaSourceOnCompilation = true
            generationTool {
                logging = Logging.WARN
                jdbc {
                    driver = 'org.mariadb.jdbc.Driver'
                    url = 'jdbc:mariadb://localhost:3306/lemon'
                    username = 'lemon-api'
                    password = '1234'
                    properties {
                        property {
                            key = 'ssl'
                            value = 'false'
                        }
                    }
                }
                generator {
                    name = 'org.jooq.codegen.JavaGenerator'
                    database {
                        name = 'org.jooq.meta.mariadb.MariaDBDatabase'
                        includes = '.*'
                    }
                    generate {
                        deprecated = false
                        records = true
                        immutablePojos = true
                        fluentSetters = true
                    }
                    target {
                        packageName = 'com.sweeti.lemon'
                        directory = 'src/main/generated'
                    }
                    strategy.name = 'org.jooq.codegen.DefaultGeneratorStrategy'
                }
            }
        }
    }
}
~~~