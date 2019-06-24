on_commit {
  build()
}

on_pull_request to: develop, {
  build()
}

on_merge to: develop, {
  deploy_to dev
}
