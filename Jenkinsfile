pipeline {
    agent any

    triggers {
        //push �Ǿ��� ���� jenkins�� ����
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                // Git ����ҿ��� �ڵ带 üũ�ƿ�
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