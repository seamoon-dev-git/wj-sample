pipeline {
    agent any

    triggers {
        //push �Ǿ��� ���� jenkins�� ����ǵ��� �ϴ� ��
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