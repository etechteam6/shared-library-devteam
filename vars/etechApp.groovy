def call(String repoUrl) {
    pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-cred', url: 'https://github.com/etechteam6/team6-shared-library.git']])
                   sh 'java -version'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
               steps {
                   sh 'df -h'
               }
           }
       }
}
}
    