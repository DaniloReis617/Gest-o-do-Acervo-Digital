FROM mcr.microsoft.com/vscode/devcontainers/java:0-11

# [Optional] Install additional OS packages.
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*
