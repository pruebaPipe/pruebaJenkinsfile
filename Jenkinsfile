pipeline {

    agent any

    stages {

	    stage ('Mvn Install') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn clean install'
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
	    
	    
        stage ('Sonar Scan') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn sonar:sonar'
                }
            }
        }
        
        
      stage('Sonar analysis') {
        
        environment {
        scannerhome = tool 'sonar mvn'
        }
        steps{
        withSonarQubeEnv('SonarQubeServer') {
          sh "${scannerHome}/bin/sonar-scanner"
              
         		 }
          
      		}
    	}    
         
    }

}
