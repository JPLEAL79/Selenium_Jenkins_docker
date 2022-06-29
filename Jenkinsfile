pipeline {
agent any

tools {
        maven 'maven3.8.6'
        jdk 'jdk8'
    }

    stages{
        stage('Descargar Fuentes'){
            steps{
                echo 'Descargando fuentes...'
                git credentialsId: 'jpleal' , url: 'https://github.com/JPLEAL79/Selenium_Jenkins_docker.git'
            }
        }

        stage('Limpiar'){
            steps{
                echo 'Limpiar proyecto...'
                sh 'mvn -f pom.xml clean'
            }
        }
    }
}


