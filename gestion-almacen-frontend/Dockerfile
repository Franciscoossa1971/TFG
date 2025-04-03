FROM node:18-alpine

WORKDIR /app

COPY package.json package-lock.json ./

RUN npm install -g @angular/cli \
    && npm install

COPY . .

EXPOSE 4300

CMD ["npm", "start"]