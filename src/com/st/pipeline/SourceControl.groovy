package com.st.pipeline

import hudson.model.*

class SourceControl{
    String credentialsId
    String url

    SourceControl(String url, String credentialsId ){
        this.url = url
        this.credentialsId = credentialsId

    }
    def checkOut(){
        stage('checkout'){
            checkout([$class: 'GitSCM',
                      branches: [[name: '*/master']],
                      doGenerateSubmoduleConfigurations: false,
                      extensions: [],
                      submoduleCfg: [],
                      userRemoteConfigs: [[credentialsId: 'jenkins-lib-github', url: 'https://github.com/BhuvanSK/gradle-examples.git']]])
        }



    }
}

