pipeline {
  agent any
  stages {
    stage('buildproject') {
      steps {
        sh 'mvn install -Dmaven.test.skip=true'
      }
    }
    stage('runtest') {
      steps {
        sh 'mvn test'
      }
    }
    stage('hygieia codeQuality') {
      steps {
        hygieiaCodeQualityPublishStep(junitFilePattern: 'activerules.pb')
      }
    }
  }
}