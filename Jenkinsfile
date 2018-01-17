pipeline {
  agent any
  stages {
    stage('hygieia codeQuality') {
      steps {
        hygieiaCodeQualityPublishStep(junitFilePattern: 'activerules.pb')
      }
    }
  }
}