FROM nginx:alpine
#RUN rm -rf /usr/share/nginx/html/*
COPY nginx/default.conf /etc/nginx/conf.d/
#COPY --from=builder /ng-app/dist/service-bank-app/ /usr/share/nginx/html
COPY ./dist/ /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]
