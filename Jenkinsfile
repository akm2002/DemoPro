pipeline {
  agent any
  stages {
    stage('buildproject') {
      steps {
        sh 'mvn -Pdev clean package -Dmaven.test.skip=true'
      }
    }
    stage('runtest') {
      steps {
        sh 'mvn test'
      }
    }
    stage('hygieia codeQuality') {
      steps {
        hygieiaCodeQualityPublishStep(junitFilePattern: 'target/surefire-reports/*xml')
      }
    }
  }
}