#!/usr/bin/env bash
set -e 

BASELINE_BRANCH=${BASELINE_BRANCH:="main"}

# Required for `git switch` on CI
git fetch origin

# Gather baseline perf measurements
git checkout head~1
yarn install --force
yarn reassure --baseline

# Gather current perf measurements & compare results
git checkout "$BASELINE_BRANCH"

yarn install --force
yarn reassure --branch
