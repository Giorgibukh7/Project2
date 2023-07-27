pipeline{
  agent any
  stages{
    stage('Test'){
      parallel{
        stage('Functionality Test'){
          steps{
            bat 'mvn clean test'
          }
        }
        stage('get version'){
          steps{
           bat 'mvn -version'
          }
        }
        
      }
    }
    
  }
}
