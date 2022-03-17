def call(){
	pipeline {
	agent any
	stages {
		stage('hola'){
			steps{
				println 'hola'
			}

		}
	}

	}
}