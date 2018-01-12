pipeline {
  agent any
  stages {
    stage('artifactPublish') {
      steps {
        hygieiaArtifactPublishStep(artifactName: 'DemonPJ-0.0.1-SNAPSHOT', artifactDirectory: '\\target', artifactGroup: 'com.pj', artifactVersion: '0.0.1-SNAPSHOT')
      }
    }
  }
}