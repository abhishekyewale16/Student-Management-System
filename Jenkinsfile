pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello from Git!'
            }
        }
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/abhishekyewale16/Student-Management-System.git'
            }
        }
    }
}
