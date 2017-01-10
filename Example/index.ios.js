import React, { Component } from 'react';
import {
  AppRegistry,
  Image,
  StyleSheet,
  Text,
  View,
  TouchableHighlight,
} from 'react-native';

import Shimmer from 'react-native-shimmer';

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
      <Shimmer style={styles.loading} speed={100}>
        <Text style={styles.loadingText}>Loading...</Text>
      </Shimmer>
      <Shimmer direction="down">
        <Image source={{ uri: 'https://arcweb.co/wp-content/uploads/2016/10/react-logo-1000-transparent.png' }} style={styles.reactLogo} />
      </Shimmer>
      </View>
    </View>
  );
}

AppRegistry.registerComponent('Example', () => Example);
