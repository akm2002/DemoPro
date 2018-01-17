pipeline {
  agent any
  stages {
    stage('buildproject') {
      steps {
        sh 'mvn install'
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