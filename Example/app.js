import React from 'react';
import { Image, StyleSheet, Text, View } from 'react-native';

import Shimmer from 'react-native-shimmer';
import logoSource from './react-logo.png';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  title: {
    fontSize: 22,
    fontWeight: '300',
    marginBottom: 20,
  },
  loading: {
    marginVertical: 10,
  },
  loadingText: {
    textAlign: 'center',
    fontSize: 16,
    fontWeight: '500',
  },
  reactLogo: {
    width: 150,
    height: 150,
  },
});

export default function Example(props) {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Shimmer Example</Text>
      <View>
        <Shimmer style={styles.loading} duration={1000}>
          <Text style={styles.loadingText}>Loading...</Text>
        </Shimmer>
        <Shimmer direction="down">
          <Image source={logoSource} style={styles.reactLogo} />
        </Shimmer>
      </View>
    </View>
  );
}
