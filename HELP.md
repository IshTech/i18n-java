## GPG signing

### M2 settings
- In your ~/.m2/settings.xml

```
<settings>
  <servers>
    <server>
      <!--
        Match the server id used in <distributionManagement> and <serverId> for sonatype staging plugin in pom.xml
      -->
      <id>ossrh</id> 
      <username>TODO</username>
      <password>TODO</password>
    </server>
  </servers>
  <profiles>
    <profile>
      <id>ossrh</id>
      <properties>
        <gpg.keyname>TODO</gpg.keyname>
        <!-- GPG should prompt for passphrase if not provided here. -->
        <gpg.passphrase>TODO</gpg.passphrase>
        <!-- <gpg.executable>/path/to/gpg.exe</gpg.executable> -->
      </properties>
    </profile>
  </profiles>
</settings>
```

## Build and Deploy
### How to build and deploy to sonatype
`mvn clean install deploy -P ossrh`
