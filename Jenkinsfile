pipeline{
  agent any
  stages{
    stage('Functionality Test'){
      parallel{
        stage('Functionality Test'){
          steps{
            bat 'mvn clean test'
          }
        }
        stage('Sleep'){
          steps{
           sleep(time:500,unit:'MILLISECONDS')
          }
        }
        
      }
    }
    
  }
}
