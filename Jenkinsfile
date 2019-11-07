pipeline {

    agent any

    stages {

	    stage ('Mvn Install') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh 'mvn -Djacoco.destFile=./coverage/jacoco.exec clean org.jacoco:jacoco-maven-plugin:0.7.8:prepare-agent install'
                }
            }
        }
/*	    
        stage ('Sonar Scan') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn sonar:sonar'
                }
            }
        }
 */       
        
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
