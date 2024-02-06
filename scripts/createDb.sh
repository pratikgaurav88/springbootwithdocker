#!/bin/bash
echo Starting SQL Custom Scripts
mkdir /opt/oracle/oradata/ORCLCDB/dockerdb
sqlplus / as sysdba @"C:/workspace/oracle-ws/docker-practice/student-service/scripts/createDb.sql"