#!/usr/bin/env groovy

def call(String db_details = 'not_defined') {
	echo db_details.url
	echo db_details.puerto
	echo db_details.usuario
	echo db_details.password
}