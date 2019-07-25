on_commit {
  build()
}

on_pull_request to: master, {
  build()
}

on_merge to: master, {
  deploy_to dev
  penetration_test()
}
