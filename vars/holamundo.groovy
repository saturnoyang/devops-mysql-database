#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."

  
  env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }



}
