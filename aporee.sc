a = "curl 'https://aporee.org/api/ext/?lat=41.40338&lng=2.17403'".unixCmd;

"curl -s 'https://aporee.org/api/ext/?lat=41.40338&lng=2.17403' | jq '.'".unixCmd;

m = "curl -s 'https://aporee.org/api/ext/?lat=41.40338&lng=2.17403' | jq ' .[] | .url'".unixCmd;