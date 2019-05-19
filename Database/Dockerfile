FROM postgres:9.4
LABEL maintainer="wilgares@gmail.com"

RUN localedef -i de_DE -c -f UTF-8 -A /usr/share/locale/locale.alias de_DE.UTF-8
ENV LANG de_DE.utf8

ENV POSTGRES_USER=myuser
ENV POSTGRES_PASSWORD=password
ENV POSTGRES_DB=mydb

COPY ./scripts/ /docker-entrypoint-initdb.d/
