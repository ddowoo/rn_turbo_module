import React from 'react';
import {useState} from 'react';
import {SafeAreaView, StatusBar, Text, Button} from 'react-native';
import RTNRecorder from 'rtn-recorder/js/NativeRecorder';

const App: () => JSX.Element = () => {
  const [result, setResult] = useState<number | null>(null);

  console.log(RTNRecorder);

  return (
    <SafeAreaView>
      <StatusBar barStyle={'dark-content'} />
      <Text style={{marginLeft: 20, marginTop: 20}}>3+7={result ?? '??'}</Text>
      <Button
        title="Compute"
        onPress={async () => {
          const value = await RTNRecorder?.add(3, 7);
          setResult(value ?? null);
        }}
      />
    </SafeAreaView>
  );
};
export default App;
