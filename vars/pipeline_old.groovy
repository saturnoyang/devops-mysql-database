def call(){
	pipeline {
		options {
			timeout(time: 30,unit: 'MINUTES')
		}
	agent any
	stages {
		stage('hola'){
			steps{
				echo 'hola'
			}

		}
	}

	}
}