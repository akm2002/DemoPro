pipeline {
  agent any
  stages {
    stage('artifactPublish') {
      parallel {
        stage('artifactPublish') {
          steps {
            hygieiaArtifactPublishStep(artifactName: '0.0.1-SNAPSHOT', artifactDirectory: '\\target', artifactGroup: 'com.DemoPro', artifactVersion: '0.0.1-SNAPSHOT')
          }
        }
        stage('mvnTest') {
          steps {
            sh 'mvn surefire-report:report'
            hygieiaBuildPublishStep(buildStatus: 'Failure')
          }
        }
      }
    }
    stage('buildPublish') {
      parallel {
        stage('buildPublish') {
          steps {
            hygieiaBuildPublishStep(buildStatus: 'success')
          }
        }
        stage('mvnBuild') {
          steps {
            sh 'mvn install'
          }
        }
      }
    }
  }
}