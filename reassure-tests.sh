#!/usr/bin/env bash
set -e 
BASELINE_BRANCH=${BASELINE_BRANCH:="head~1"}
COMPARE_BRANCH=${COMPARE_BRANCH:="main"}

# Required for `git switch` on CI
git fetch origin

# Gather baseline perf measurements
git checkout "$BASELINE_BRANCH"
yarn install --force
yarn reassure --baseline

# Gather current perf measurements &  results
git checkout "$COMPARE_BRANCH"

yarn install --force
yarn reassure --branch
