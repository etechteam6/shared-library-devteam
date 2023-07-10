 def uber(String repoUrl){
    pipeline{
        agent any 
        stages{
            stage('1-build'){
                steps{
                    sh 'free -g'
                }
            }
            stage('Checkout Code'){
                steps {
                    git branch: 'main',
                    url: "${repoUrl}"
                }
            }
            stage('closing'){
                steps{
                    echo "new demo"
                }
            }
        }
    }
 }