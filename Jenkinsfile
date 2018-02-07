pipeline {
  agent any
  stages {
    stage('hygieia codeQuality') {
      steps {
        hygieiaCodeQualityPublishStep(junitFilePattern: 'activerules.pb')
      }
    }
    stage('') {
      steps {
        sh '''mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true

mvn sonar:sonar'''
      }
    }
  }
}