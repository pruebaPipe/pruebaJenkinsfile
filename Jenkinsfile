pipeline {

    agent any

    stages {

	    stage ('Mvn Install') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn install'
                }
            }
        }
	    
        stage ('Sonar Scan') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn sonar:sonar'
                }
            }
        }
        
        stage ('Test') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh 'mvn test'
                }
            }
        }        
          
         
    }

}
