FROM liquibase/liquibase
ARG DB_FILE=dbschema/*.xml
COPY ${DB_FILE} /liquibase/changelog/
RUN ls /liquibase/changelog/
ENV CHANGELOGFILE=changelog-master.xml
CMD ["sh", "-c", "docker-entrypoint.sh --url=${URL} --username=${USERNAME} --password=${PASSWORD} --classpath=/liquibase/changelog --changeLogFile=${CHANGELOGFILE} update"]