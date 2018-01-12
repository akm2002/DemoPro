pipeline {
  agent any
  stages {
    stage('artifactPublish') {
      steps {
        hygieiaArtifactPublishStep(artifactName: '0.0.1-SNAPSHOT', artifactDirectory: '\\target', artifactGroup: 'com.DemoPro', artifactVersion: '0.0.1-SNAPSHOT')
      }
    }
  }
}