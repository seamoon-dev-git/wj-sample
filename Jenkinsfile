pipeline {
    agent any

    triggers {
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