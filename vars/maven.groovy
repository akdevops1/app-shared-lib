def call(Map config = [:]){

   mvn="${JENKINS_HOME}/maven/bin/mvn"

   sh """
        ${mvn} test
   """
    
}