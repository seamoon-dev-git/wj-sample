pipeline {
    agent any

    triggers {
        //push 되었을 때만 jenkins가 실행되도록 하는 것
        githubPush() 
    }

    stages {
        stage('test') {
            steps {
                sh '''
                    echo "TEST"
                '''
            }
        }
    }
}