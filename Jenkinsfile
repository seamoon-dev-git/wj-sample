pipeline {
    agent any

    triggers {
        //push 되었을 때만 jenkins가 실행
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                // Git 저장소에서 코드를 체크아웃
                git branch: 'main', url: 'https://github.com/216230020/wj-sample.git'
            }
        }

        stage('Test') {
            steps {
                sh '''
                    echo "TEST"
                '''
            }
        }
    }
}