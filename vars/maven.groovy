def call(Map config = [:]){
    mavenPath = "{JENKINS_HOME}/maven/bin/mvn"
    
    print config.param

    sh """
        $mavenPath ${config.param}
    """
}