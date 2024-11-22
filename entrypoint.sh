#!/usr/bin/env bash
set -e

# Build and start
export PATH="/opt/keycloak/bin:$PATH"
export KC_PROXY_HEADERS="forwarded"
export KC_HOSTNAME="$KC_HOSTNAME"
export KC_HTTP_ENABLED="true"

kc.sh build && kc.sh start --optimized --import-realm
