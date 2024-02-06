ALTER USER sys IDENTIFIED BY Welcome123#;
create pluggable database dockerdb  admin user dbuser identified by Welcome123# roles = (DBA) FILE_NAME_CONVERT =('/opt/oracle/oradata/ORCLCDB/pdbseed','/opt/oracle/oradata/ORCLCDB/dockerdb');
alter pluggable database dockerdb open;
ALTER SESSION SET container = dockerdb;
GRANT UNLIMITED TABLESPACE TO dbuser;
exit;