# How to Deploy Spring Boot API to AWS #

We will use the following AWS services:

1. CodeCommit - to store project source code (You can use Bitbucket or GitHub)
2. CodeBuild - to build project as a docker image
3. Elastic Container Registry (ECR) - to store docker image
4. Elastic Container Service (ECS) - to deploy and run container app on cluster