#!/bin/sh

)IFDEF JAVA-HOME
export JAVA_HOME=%JAVA-HOME.
export PATH=$PATH:%JAVA-HOME./bin
)ENDIF

)IFDEF MAVEN-HOME
export PATH=$PATH:%MAVEN-HOME./bin
)ENDIF

echo $JAVA_HOME
echo $PATH

)REP DMSOURCE
mvn -f "%DMSOURCE." package
)ENDR

echo ** Build Complete **
exit 0
