package com.plaid.linksample

/*

curl -X POST \
  https://sandbox.plaid.com/link/token/create \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: ab071db2-d06e-9bd3-0587-7b478bf26583' \
  -d '{
  "client_id": "59133ba1bdc6a44cd258c4c3",
  "secret": "d1963ed5eeab101a880a9cd006430e",
  "user": {    "client_user_id": "dfa1684b41abbf7386d5def0b99e65"},
  "client_name": "Plaid App",
  "products": ["auth"],
  "country_codes": ["GB"],
  "language": "en",
  "webhook": "https://sample-web-hook.com",
  "account_filters": {
      "depository": {
          "account_subtypes": ["checking"]
      }
  }
}'





 */