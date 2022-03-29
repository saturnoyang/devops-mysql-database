#!/usr/bin/env groovy

def call(String nam = 'human') {
  echo "Hello, ${nam}."

  
  env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }



}
